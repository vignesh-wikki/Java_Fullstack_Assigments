import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ApiService {
  private Key = 'data';
  updating: boolean = false;
  id: number = 0;
  constructor() {}

  save(item: any): void {
    const items = this.get();
    const existingIndex = items.findIndex((i: any) => i.id === item.id);

    if (existingIndex !== -1) {
      items[existingIndex] = item;
    } else {
      items.push(item);
    }

    localStorage.setItem(this.Key, JSON.stringify(items));
  }

  get(): any[] {
    const storedItems = localStorage.getItem(this.Key);
    return storedItems ? JSON.parse(storedItems) : [];
  }

  delete(id: number): void {
    const items = this.get();
    const filteredItems = items.filter((item: any) => item.id !== id);
    localStorage.setItem(this.Key, JSON.stringify(filteredItems));
  }

  getItemById(id: number): any {
    const items = this.get();
    return items.find((item: any) => item.id === id);
  }
}
