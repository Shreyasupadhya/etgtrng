class Arrayex{
    numarr:number[]=[1,2,3,4];
    i:number;

    find(){
        for(this.i=0;this.i<this.numarr.length;this.i=this.i+1){
            if (5==this.numarr[this.i]){
                console.log("number found");
            }
        }
    }


}
var arr=new Arrayex();
arr.find();