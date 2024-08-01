import { Component } from '@angular/core';
import { ApiService } from '../api.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrl: './view.component.css',
})
export class ViewComponent {
  items: any[];
  updating: boolean = false;
  constructor(private api: ApiService ,private router :Router) {
    this.items = this.api.get();
    console.log(this.items);
  }
  delete(id: number) {
    this.api.delete(id);
    this.items = this.api.get();
  }
  update(id:number){
    this.api.updating=true;
    this.api.id=id;
    this.router.navigate(['/add']);
  }
}
