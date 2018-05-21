class Sec{

static void sum(int x=6,int y){
    println("¼Ó·¨£º"+(x+y));
}

static void printFile(){
File file=new File("E:/Project/as/huajian_android/settings.gradle");
    file.eachLine{
        line-> println(line);
    }
println file.text;
}

static void printMap(){
def map=["a":"1","b":"2"];
    map.each{
       println (it)
    }
    map.each{
       println ("${it.key} maps to :${it.value}");
    }
}

static void main(String[] args){
    def range=0..5;
    println(range);
        println(range.size());
    for(int tem:range){
        println(tem)
    }
    sum(11);
    printFile();
    printMap();
}
}