class Node {
    constructor(val) {
        this.val = val;
        this.next = null;
    }
}

const linkedListValues = (head) => {
    const values = [];
    let current = head;
    while (current != null) {
        values.push(current.val);
        current = current.next;
    }
    return values;
};

const a = new Node("A");
const b = new Node("B");
const c = new Node("C");
const d = new Node("D");
a.next = b;
b.next = c;
c.next = d;

console.log(linkedListValues(a));