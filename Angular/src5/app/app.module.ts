import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { Revision1Component } from './revision1/revision1.component';
import { Revision2Component } from './revision2/revision2.component';
import { Revision3Component } from './revision3/revision3.component';
import { Revision4Component } from './revision4/revision4.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    Revision1Component,
    Revision2Component,
    Revision3Component,
    Revision4Component
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      {path:'', component:Revision1Component},
      {path:'revision', component:Revision2Component},
      {path:'revision4',component:Revision4Component}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
