class GöteborgZoo extends Zoo {


    @Override
    public void endangeredAnimal() {
        System.out.println("Utrotningshotade djur: \nElefant, Noshörning");
    }

    @Override
    public void type() {
        System.out.println("Typ: \nZoo och nöjesfält");
    }

    @Override
    public void admission() {

    }

    @Override
    public void location() {
        System.out.println("Lokation:\n Göteborg\n");
    }

    @Override
    public void openHours() {
        System.out.println("Öppettider: \nVardagar: 9-18\nHelger: 10-16\n" );
    }

    @Override
    public void prize() {
        System.out.println("Priser: \nBarn under 5 år: Gratis\nUngdomar (5-18):50kr\nVuxna:100kr\nPensionär/Student: 50kr ");
    }
}
