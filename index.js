import LinkedListNode from "./Data Structures/LinkedListNode";
import LinkedList from "./Data Structures/LinkedList";

let list = new LinkedList()
list.append(2000)
list.append(4)
list.append(6)
list.append(8)
list.append(2)
list.append(1000000)
let array = [1,2,3,4,4,5,5,6,6,7]
// list.print()
// console.log('------------------')
// list.append(10)
// list.append(12)
// list.append(14)
// list.print()
// console.log('------------------')
// list.deleteAll(2)
// list.print()
// console.log('------------------')
// list.deleteAll(14)
// list.print()
list.fromArray(array)
list.print()
array = list.toArray()
console.log('______________________________')
array.forEach(value => console.log(value))
// list.reverse()
// list.print()
