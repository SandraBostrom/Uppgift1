class Naturhistoriska extends Museum  {
    @Override
    public void utställningar() {
        System.out.println("Dessa utställningar har vi: \n*Skelett \n*Dinosaurier");
    }

    @Override
    public void openHours() {
        System.out.println("Öppet mellan \n9-18 vardagar \n11-16 helger \n");
    }

    @Override
    public void prize() {
        System.out.println("Pris: \nBarn upp till 3 år: gratis \nUngdomar: 50kr \nÖvriga 100kr");
    }

    @Override
    public void type() {
        System.out.println("Nature museum");
    }

    @Override
    public void admission() {

    }

    @Override
    public void location() {
        System.out.println("Stockholm, Djurgården");
    }
}




