package models;

class Waiter  {
    public int id;



    public Waiter(int id) {
        this.id = id;


    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Waiter [id=" + id + "]";
    }
}

