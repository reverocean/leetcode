package com.rever.leetcode.tree;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Node {
    private Node left;
    private Node right;
    private int value;
}
