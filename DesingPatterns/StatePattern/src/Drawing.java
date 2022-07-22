class Drawing
{
    private Shape s = new Triangle();

    public void changeShape()
    {
        s = new Circle();
    }

    public void startDrawing()
    {
        s.draw();
    }
}