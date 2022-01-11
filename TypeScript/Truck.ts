import { Car } from "./Car";

class Truck extends Car{
    weight:number;
    getSalePrice(): number {
        if(this.weight>2000){
            return this.regularPrice=this.regularPrice*0.9;
        }
        else{
            return this.regularPrice=this.regularPrice*0.8;
        }
    }
    display(){
        console.log(this.speed);
        console.log(this.color);
        console.log(this.weight);
        console.log(this.regularPrice)
        console.log(this.getSalePrice());
    }
}
var t=new Truck();
t.speed=80;
t.color="red";
t.weight=2000;
t.regularPrice=40000;
t.display();