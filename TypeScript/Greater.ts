class Greater{
    a:number=12;
    b:number=25;
    c:number=89;
    res:number;

    greatest(){
        if (this.a>this.b&&this.a>this.c){
            this.res=this.a;
            console.log(this.res);
        }
        else if(this.b>this.a&&this.b>this.c){
            this.res=this.b;
            console.log(this.res);
        }
        else{
            this.res=this.c;
            console.log(this.res);
        }
    }
}
var g=new Greater();
g.greatest();