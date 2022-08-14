public class Main {
	public static void morrisTraversal(Node root){
		Node curr=root;
		while(curr!=null){
			if(curr.left==null){
				System.out.println(curr.data);
				curr=curr.right;
			}else{
				Node temp=curr.left;
				while(temp.right!=null&&temp.right!=curr){
					temp=temp.right;
				}
				if(temp.right==null){
					temp.right=curr;
					curr=curr.left;
				}else{
					temp.right=null;
					System.out.println(curr.data);
					curr=curr.right;
				}
			}
		}
	}
	public static void inorder(Node root){
		if(root==null){
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.left.right.left=new Node(6);
		root.right.right=new Node(8);
		root.right.right.right=new Node(9);
		//inorder(root);
		morrisTraversal(root);
	}
}
