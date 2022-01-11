class Product{
    pid:number;
    pname:string;
    price:number;

    display(){
        console.log(this.pid);
        console.log(this.pname);
        console.log(this.price);
    }

    gstprice(){
        var proprice=this.price*1.12;
        console.log(proprice)
    }
}
var pr1=new Product();
pr1.pid=123;
pr1.pname="xyz";
pr1.price=123.45;
pr1.display();
pr1.gstprice();