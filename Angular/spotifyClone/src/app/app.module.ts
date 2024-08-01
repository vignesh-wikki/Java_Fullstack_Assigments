import { NgModule } from '@angular/core';
import {
  BrowserModule,
  provideClientHydration,
} from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ViewComponent } from './view/view.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { RouterModule, Routes, Router } from '@angular/router';
import { AddingComponent } from './adding/adding.component';
const ROUTES: Routes = [
  {
    path: '',
    component: ViewComponent,
  },
  {
    path: 'add',
    component: AddingComponent,
  },
];
@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ViewComponent,
    SidebarComponent,
    AddingComponent,
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(ROUTES),
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
