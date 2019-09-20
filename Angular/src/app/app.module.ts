import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import {RouterModule} from '@angular/router'; 
// we have to import routermodule for routing
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { SampleComponent } from './Sample.Component';
import { HeaderComponent } from './header/header.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { BikeComponent } from './bike/bike.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { HeadersComponent } from './headers/headers.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { AboutComponent } from './about/about.component';
import { PageComponent } from './page/page.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { RegisterComponent } from './register/register.component';
import { Child1Component } from './child1/child1.component';
import { Child2Component } from './child2/child2.component';
import { Child3Component } from './child3/child3.component';
import { FooterComponent } from './footer/footer.component';
import { ObservablesComponent } from './observables/observables.component';

@NgModule({
  declarations: [
    AppComponent,
    SampleComponent, 
    HeaderComponent, 
    DataBindingComponent, 
    BikeComponent, BikeDetailsComponent, 
    HeadersComponent, HomeComponent, 
    LoginComponent, 
    AboutComponent, PageComponent, 
    PageNotFoundComponent, RegisterComponent, 
    Child1Component, Child2Component, Child3Component, FooterComponent, ObservablesComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'',component:HomeComponent},
      {path:'about', component:AboutComponent,children:[
        {path:'child1',component:Child1Component},
        {path:'child2',component:Child2Component},
        {path:'child3',component:Child3Component},
      ]},
      {path:'login',component:LoginComponent},
      {path:'register',component:RegisterComponent},
      {path:'observables',component:ObservablesComponent},
      {path:'**',component:PageNotFoundComponent},
    
    ]),
    FormsModule,
    ReactiveFormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
