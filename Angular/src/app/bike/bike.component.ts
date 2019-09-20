import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.css']
})
export class BikeComponent implements OnInit {
bikeData:any ='';
bikes=[
  {
    brand:'KTM',
    img:'https://cdn.pixabay.com/photo/2019/04/19/10/29/motorcycle-4139052__340.jpg',
    description:'KTM AG (the former KTM Sportmotorcycle AG) is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934. ... KTM is known for its off-road motorcycles (enduro, motocross and supermoto).'
  },
  {
    brand:'Royal Enfield',
    img:'https://cdn.pixabay.com/photo/2017/11/23/04/08/royal-enfield-2972008__340.jpg',
    description:'The Royal Enfield Bullet was originally a British overhead valve single cylinder four-stroke motorcycle made by Royal Enfield in Redditch, Worcestershire, now produced by Royal Enfield (India) at Chennai, Tamil Nadu, a company originally founded by Madras Motors to build Royal Enfield motorcycles under licence in India'
  },
  {
    brand:'Apache',
    img:'https://media.zigcdn.com/media/model/2018/May/apache-rtr160-full-right-side-view_600x300.jpg',
    description:'The Apache RTR 180 is the first and the cheapest bike with ABS available in India. The RTR 200 4V is powered by an oil-cooled engine coupled with a five-speed transmission. Top cycle parts like synchronized stiff chassis, petal brakes, functional aerodynamic cowl used in the Apache ensures maximum performance.'
  },
  {
    brand:'Avenger',
    img:'https://auto.ndtvimg.com/bike-images/big/bajaj/avenger-street-220/bajaj-avenger-street-220.webp?v=4',
    description:'Bajaj Avenger Street 220 and Cruise 220 are powered by the same 219.9cc engine and it generates maximum power of 18.8 Bhp @ 8400 rpm (19.03 PS) with maximum torque of 17.5 Nm @ 7000 rpm. The engine is air-cooled with an oil-cooler and it is mated to a 5-speed gearbox. ... The fuel tank capacity of Avenger 220 is 14 litres.'
  },
  {
    brand:'Avenger',
    img:'https://auto.ndtvimg.com/bike-images/big/bajaj/avenger-street-220/bajaj-avenger-street-220.webp?v=4',
    description:'Bajaj Avenger Street 220 and Cruise 220 are powered by the same 219.9cc engine and it generates maximum power of 18.8 Bhp @ 8400 rpm (19.03 PS) with maximum torque of 17.5 Nm @ 7000 rpm. The engine is air-cooled with an oil-cooler and it is mated to a 5-speed gearbox. ... The fuel tank capacity of Avenger 220 is 14 litres.'
  }
]
  
  constructor() { }

  sendData(bike){
      //declare a var outside the func cz it can be accessible by any method but if we declare  here it wont accessible
      this.bikeData=bike;
  }
  ngOnInit() {
  }

}
