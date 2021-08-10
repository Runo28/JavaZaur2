package Generics.UPL;

public class Dinamo extends Player{
    private static int n = 0;
    private int nomer;
    public Dinamo(String name, String surname, int age) {
        super(name, surname, age);
        n++;
        this.nomer=n;
    }

    @Override
    public void printPlayer() {
        System.out.print("Номер: "+nomer);
        super.printPlayer();
    }
}

class Shahtar extends Player {
    private static int n = 0;
    private int nomer;

    public Shahtar(String name, String surname, int age) {
        super(name, surname, age);
        n++;
        this.nomer=n;
    }
    @Override
    public void printPlayer() {
        System.out.print("Номер: "+nomer);
        super.printPlayer();
    }
}

class Desna extends Player {
    public Desna(String name, String surname, int age) {
        super(name, surname, age);
    }
}

class Zaria extends Player {
    public Zaria(String name, String surname, int age) {
        super(name, surname, age);
    }
}

class Vorskla extends Player {
    public Vorskla(String name, String surname, int age) {
        super(name, surname, age);
    }
}

class Kolos extends Player {
    public Kolos(String name, String surname, int age) {
        super(name, surname, age);
    }
}

class Olimpik extends Player {
    public Olimpik(String name, String surname, int age) {
        super(name, surname, age);
    }
}

class Oleksandiya extends Player {
    public Oleksandiya(String name, String surname, int age) {
        super(name, surname, age);
    }
}

class Mariupol extends Player {
    public Mariupol(String name, String surname, int age) {
        super(name, surname, age);
    }
}

class Ingulec extends Player {
    public Ingulec(String name, String surname, int age) {
        super(name, surname, age);
    }
}

class Minay extends Player {
    public Minay(String name, String surname, int age) {
        super(name, surname, age);
    }
}

class Ruh extends Player {
    public Ruh(String name, String surname, int age) {
        super(name, surname, age);
    }
}

class Lviv extends Player {
    public Lviv(String name, String surname, int age) {
        super(name, surname, age);
    }
}

class Dnepr1 extends Player {
    public Dnepr1(String name, String surname, int age) {
        super(name, surname, age);
    }
}