package Tree;
public class BinaryApps {
    
    public static void main(String[] args) {
        var binding = new BinaryTree();
        
        TreeNode node;
        node = new TreeNode('D');
        binding.insert(node);
        
        node = new TreeNode('B');
        binding.insert(node);
        
        node = new TreeNode('A');
        binding.insert(node);
        
        node = new TreeNode('C');
        binding.insert(node);
        
        node = new TreeNode('F');
        binding.insert(node);
        
        node = new TreeNode('E');
        binding.insert(node);
        
        node = new TreeNode('G');
        binding.insert(node);
        
    
        System.out.println("Traversal dengan Preorder : ");
        binding.preOrder();
        System.out.println("\nTraversal dengan Inorder : " );
        binding.inOrder();
        System.out.println("\nTraversal dengan Postorder : " );
        binding.postOrder();
        System.out.println();
        System.out.println("Hai Faizal");
        
    }
}
