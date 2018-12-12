import LinkedListNode from './LinkedListNode'

export default class LinkedList{
    constructor(){
        this.head = null
        this.tail = null
    }

    print(){
        let currentNode = this.head
        while(currentNode){
            console.log(currentNode.value + "  ")
            currentNode = currentNode.next
        }
    }
    
    prepend(value){
        const newNode = new LinkedListNode(value, this.head)
        this.head = newNode
        if(!this.tail){
            this.tail = newNode
        }
        return this
    }

    append(value){
        const newNode = new LinkedListNode(value)
        if(!this.head){
            this.head = newNode
            this.tail = newNode
            return this
        }
        this.tail.next = newNode
        this.tail = newNode
        return this
    }

    deleteOne(value){
        if(!this.head){
            return null
            console.log("No node is exist to delete")
        }

        let deletedNode = null

        if(this.head.value === value){
            deletedNode = this.head
            this.head = this.head.next
        }
        let currentNode = this.head
        while(!currentNode.next){
            if(currentNode.next.value === value){
                currentNode.next = currentNode.next.next
                deletedNode = currentNode
                return deletedNode
            }
            else{
                currentNode = currentNode.next
            }
        }
        return null
    }

    deleteAll(value){
        if(!this.head){
            return null
            console.log("No node is exist to delete")
        }
        
        let deletedNode = null
        while(this.head && this.head.value === value){
            deletedNode = this.head
            this.head = this.head.next 
        }
        
        let currentNode = this.head
        
        if(currentNode !== null){
            while(currentNode.next){
                if(currentNode.next.value === value){
                    deletedNode = currentNode
                    currentNode.next = currentNode.next.next
                } else{
                    currentNode = currentNode.next
                }
            }
        }
    }

    deleteHead(){
        if(!this.head){
            return null
            console.log("No node is exist to delete")
        }
        const deletedHead = this.head

        if(this.head.next){
            this.head = this.head.next
        } else{
            this.tail = null
            this.head = null
        }
        return deletedHead
    }

    deleteTail(){
        if(!this.tail){
            return null
            console.log("No node is exist to delete")
        }
        
        let currentNode = this.head
        
        let deletedNode = null
        
        if(!currentNode.next){
            deletedNode = this.head
            this.head = null
            this.tail = null
            console.log(deletedNode.value)
            return deletedNode
        }
        let previousNode = this.head
        currentNode = currentNode.next
        while(currentNode.next){
            previousNode = currentNode
            currentNode = currentNode.next 
        }
        deletedNode = currentNode
        previousNode.next = null 
        console.log(deletedNode.value)
        return deletedNode
    } 
}