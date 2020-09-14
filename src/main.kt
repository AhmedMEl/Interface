interface NatureAnimals{
    fun petAnimals()
    fun nonPetAnimals()
}

interface TypeAnimals:NatureAnimals{
    fun mammals()
    fun nonMammals()
}

class Animals(var nameAnimals:String,var typeBlood:String,var canineTeeth:Boolean,var stayWithHuman:Boolean):TypeAnimals{

    override fun mammals() {
        if(typeBlood=="hot"){
            println("The $nameAnimals is mammals")
        }
    }

    override fun nonMammals() {
        if(typeBlood=="cold"){
            println("The $nameAnimals is nonMammals")
        }
    }

    override fun petAnimals() {
        if(canineTeeth==false && stayWithHuman==true || canineTeeth==true && stayWithHuman==true){
            println("The $nameAnimals is petAnimals")
        }
    }

    override fun nonPetAnimals() {
         if(canineTeeth==true && stayWithHuman==false || canineTeeth==false && stayWithHuman==false){
            println("The $nameAnimals is nonPetAnimals")
        }
    }

}

fun main() {
    var animals1=Animals("cat","hot",true,true)
    animals1.mammals()
    animals1.nonMammals()
    animals1.nonPetAnimals()
    animals1.petAnimals()


}