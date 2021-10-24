
/**
 * @param {TreeNode} root
 * @return {number}
 */
var countNodes = function (root) {
    if (root === null) {
        return 0;
    }

    let leftHeight = countLeftHeight(root);
    let rightHeight = countRightHeight(root);

    if (leftHeight === rightHeight) {
        return  Math.pow(2, leftHeight) - 1;
    }
    return 1 + countNodes(root.left) + countNodes(root.right);
};

function countLeftHeight(root) {
    let current = root;
    let counter = 1;
    while (current.left !== null) {
        current = current.left;
        counter++;
    }
    return counter;
}

function countRightHeight(root) {
    let current = root;
    let counter = 1;
    while (current.right !== null) {
        current = current.right;
        counter++;
    }
    return counter;
}


function TreeNode(val, left, right) {
    this.val = (val === undefined ? 0 : val);
    this.left = (left === undefined ? null : left);
    this.right = (right === undefined ? null : right);
}
