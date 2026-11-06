public class ArrayInterfaceTest {
    public static void main(String[] args){
        Drawable[] drawables = new Drawable[3];
        drawables[0] = new Pen();
        drawables[1] = new Pencil();
        drawables[2] = new Pen();
        for(Drawable d : drawables){
            d.draw();
            System.out.println(d instanceof Drawable);
        }
    }
}