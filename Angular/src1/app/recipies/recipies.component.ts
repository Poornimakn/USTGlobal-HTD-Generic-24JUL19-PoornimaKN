import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-recipies',
  templateUrl: './recipies.component.html',
  styleUrls: ['./recipies.component.css']
})
export class RecipiesComponent implements OnInit {
  recipieData:any='';
  recipies=[
  {
    brand:'Frankie',
    img:'https://images.media-allrecipes.com/images/56610.png',
    description:'BMW took wraps off the new-gen 3 Series at the 2018 Paris Motor Show. The G20 3 Series takes its inspiration from the resurrected 8 and comes with many modern day features while retaining its characteristic driving dynamics. And the new 3 Series is a lot better looking compared to the F30 model it replaces.Up front, the new iteration of BMW’s Kidney grille is characteristic of the new crop of BMWs. The headlights carry the signature DRL styling but are a lot bigger and edgier than the F30. While the L-shaped taillights are akin to the ones seen on the new Z4 Roadster and 8 Coupe. The overall profile remains unchanged but there are subtle changes around the windows and roofline coupled with new design alloy wheels of up to 19-inches to make it appear fresh. There are different bumper styles depending on the trim levels. And the standard 3 seems to have taken a lot of sporty bits from the high-performance M3. The new 3 Series is based on the same CLAR platform that underpins the 5 and 7 Series. The chassis gets new damper technology, stiffer body structure and suspension mountings, wider tracks, minimised weight, a low vehicle centre of gravity and even 50:50 weight distribution.'
  },
  {
    brand:'Pasta',
    img:'https://www.thechunkychef.com/wp-content/uploads/2017/08/One-Pot-Chicken-Parmesan-Pasta-feat-500x375.jpg',
    description:'It’s been nearly five years since Skoda’s most popular sedan,the Rapid got an update and now the Czech manufacturer has finally decided to give the car its most comprehensive update in a bid to increase the numbers.'
  },
  {
    brand:'Maggie',
    img:'http://www.tasty-indian-recipes.com/wp-content/uploads/2014/05/Maggi-Vegetable-Atta-Noodles-Recipe.jpg',
    description:'The Diesel engine is 1461 cc while the Petrol engine is 1498 cc. It is available with the Manual and Automatic transmission. Depending upon the variant and fuel type the Duster has a mileage of 13.9 to 19.87 kmpl. The Duster is a 5 seater SUV and has a length of 4360, width of 1822 and a wheelbase of 2673.'
  },
  {
    brand:'Dosa',
    img:'https://recipes.timesofindia.com/thumb/54658627.cms?imgsize=296418&width=800&height=800',
    description:'The Diesel engine is 1461 cc while the Petrol engine is 1498 cc. It is available with the Manual and Automatic transmission. Depending upon the variant and fuel type the Duster has a mileage of 13.9 to 19.87 kmpl. The Duster is a 5 seater SUV and has a length of 4360, width of 1822 and a wheelbase of 2673.'
  }
]
  constructor() { }
  sendData(recipie){
    this.recipieData=recipie;
  }
  ngOnInit() {
  }

}
