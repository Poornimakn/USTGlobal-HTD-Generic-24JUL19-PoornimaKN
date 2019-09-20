import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { BindingComponent } from './binding/binding.component';
import { CompInteractionComponent } from './comp-interaction/comp-interaction.component';
import { DirectivesComponent } from './directives/directives.component';
import { FormsComponent } from './forms/forms.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { HomeComponent } from './home/home.component';
import { HttpComponent } from './http/http.component';


@NgModule({
  declarations: [
    AppComponent,
    BindingComponent,
    CompInteractionComponent,
    DirectivesComponent,
    FormsComponent,
    PagenotfoundComponent,
    HomeComponent,
    HttpComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      {path:'',component:BindingComponent},
      {path:'dir',component:DirectivesComponent},
      {path:'form',component:FormsComponent},
      {path:'http',component:HttpComponent},
      {path:'**',component:PagenotfoundComponent} //wildcard route
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
