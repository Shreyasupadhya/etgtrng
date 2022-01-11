class StudentExample{
    stdID:number;
    stdName:string;
    stdClass:number;

    constructor(i:number, n:string , m:number){
        this.stdID=i;
        this.stdName=n;
        this.stdClass=m;
    }

    display(){
        console.log(this.stdID);
        console.log(this.stdName);
        
    }
}
var s = new StudentExample(2,"def",5);
s.display();
