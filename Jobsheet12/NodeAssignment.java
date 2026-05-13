package Jobsheet12;

public class NodeAssignment {
    StudentAssignment data;
    NodeAssignment next;

    public NodeAssignment() {
    }

    public NodeAssignment(StudentAssignment data, NodeAssignment next) {
        this.data = data;
        this.next = next;
    }
}