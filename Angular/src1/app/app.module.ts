import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { CarsComponent } from './cars/cars.component';
import { RecipiesComponent } from './recipies/recipies.component';
import { NewsComponent } from './news/news.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { HeaderComponent } from './header/header.component';
import { CardetailsComponent } from './cardetails/cardetails.component';
import { RecipiedetailsComponent } from './recipiedetails/recipiedetails.component';
import { NewsdetailsComponent } from './newsdetails/newsdetails.component';
import { MobilesdetailsComponent } from './mobilesdetails/mobilesdetails.component';

@NgModule({
  declarations: [
    AppComponent,
    CarsComponent,
    RecipiesComponent,
    NewsComponent,
    MobilesComponent,
    HeaderComponent,
    CardetailsComponent,
    RecipiedetailsComponent,
    NewsdetailsComponent,
    MobilesdetailsComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'',component:CarsComponent},
      {path:'news', component:NewsComponent},
      {path:'recipie',component:RecipiesComponent},
      {path:'mobile',component:MobilesComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
