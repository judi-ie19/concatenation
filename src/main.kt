fun main(){
    var name= "AkiraChix"
    println(name[0].toString()+name[2]+name[3])
    greeting()
    name()
    Myname("mollen")

}
fun greeting(){
    var name= "judie"
    var age= 21
    var statement=("hi,my name is $name and i am $age years old")
    println(statement)





}
fun name(){
    var interest=" i love coding"
    println(interest.length)
}
 fun Myname(name:String){
     if(name.equals("judy")){
         println("That's me")
     } else
         println("I don't know who that is")
 }