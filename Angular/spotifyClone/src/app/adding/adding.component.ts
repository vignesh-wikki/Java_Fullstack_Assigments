import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-adding',
  templateUrl: './adding.component.html',
  styleUrl: './adding.component.css',
})
export class AddingComponent {
  items: any[] = [];
  newitem: any = { id:0, name: '', imglink: '' };
  updating: boolean;
  constructor(private api: ApiService) {
    this.items = api.get();
    this.updating = api.updating;
  }

  add() {
    if(this.api.id>0){
      this.newitem.id=this.api.id;
    }
    if (this.newitem.name !== '' && this.newitem.imglink !== '') {
      if (this.newitem.id === 0) {
        this.newitem.id = new Date().getTime();
      }
      this.api.save(this.newitem);

      this.newitem = { id: 0, name: '' };
      this.items=this.api.get();
    }
  }
}
