import LinkedListNode from './LinkedListNode'

export default class LinkedList{
    constructor(){
        this.head = null
        this.tail = null
    }
    
    prepend(value){
        const newNode = new LinkedListNode(value, this.head)
        this.head = newNode
        if(!this.tail){
            this.tail = newNode
        }
        return this
    }

    append(value, next){
        const newNode = new LinkedListNode(value, this.head)
        if(!this.head){
            this.head = newNode
            this.tail = newNode
            return this
        }
        this.tail.next = newNode
        this.tail = newNode
        return this
    }

    // deleteHead(){
    //     if(!this.head){
    //         return null
    //     }
    //     this.head.next.next = 
    // }
}
