  
case class Point(x:Int,y:Int){
    def px=x
    def py=y
    def +(that:Point):Point={
        Point(that.px+this.px,that.py+this.py)
    }
    def move(dx:Int=0,dy:Int=0):Point={
        Point(dx+this.px,dy+this.py)
    }
    def dist(that:Point):Double={
        val difx=that.x-this.x
        val dify=that.y-this.y
        def square(x:Float):Float=x*x 
        Math.sqrt((difx*difx+ dify*dify))
    }
    def invert():Point={
        Point(this.py,this.px)
    }
}




object eighttute extends App{
    val c=Point(1,2)+Point(2,3)
    println(c) 
    val d=Point(0,0)
    println(d move(1,9))
    val e=Point(0,1)
    println(e.invert )
    println(d.dist(e))

 
}


