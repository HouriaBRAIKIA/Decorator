package deco;

class Node implements Event {
    private String description;

    public Node(String description) {
        this.description = description;
    }

    public void display() {
        System.out.println(description);
    }
}
