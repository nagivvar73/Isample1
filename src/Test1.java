class Simple{
    public static void main(String args[]){
        System.out.println("Hello Java1");
        System.out.println("Hello Java2");
        Addition ad=new Addition();
        ad.Add();
    }
}

class Addition{
    public void  Add()
    {
        System.out.println("I am coming from Add Function");

    }
}