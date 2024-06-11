public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen(); 
        q.moves(); 
        Bear b = new Bear();
        b.eat();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right)");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (by one dtep)");
    }
}

interface Herbivore {
    void eat();
}

interface Carnivore {
    void eat();
}

class Bear implements Herbivore, Carnivore {
    public void eat () {
        System.out.println("eats both meat and grass");
    }
}