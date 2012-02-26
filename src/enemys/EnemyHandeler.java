/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enemys;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Glenn Latomme <glenn.latomme@gmail.com>
 */
public class EnemyHandeler {

    Point2D.Double[] Pointlist = new Point2D.Double[100];
    Point2D.Double[][] Tree = new Point2D.Double[100][100];
    Point2D.Double[] Cue = new Point2D.Double[100];
    

    public EnemyHandeler() {
        Pointlist[0] = new Point2D.Double(0, 0);
        Pointlist[1] = new Point2D.Double(1, 0);
        Pointlist[2] = new Point2D.Double(2, 0);
        Pointlist[3] = new Point2D.Double(3, 0);
        Pointlist[4] = new Point2D.Double(0, 1);
        Pointlist[5] = null;
        Pointlist[6] = new Point2D.Double(2, 1);
        Pointlist[7] = new Point2D.Double(3, 1);
        Pointlist[8] = new Point2D.Double(0, 2);
        Pointlist[9] = new Point2D.Double(1, 2);
        Pointlist[10] = new Point2D.Double(2, 2);
        Pointlist[11] = new Point2D.Double(3, 2);

    }

    public void Tick() {
        /* Wrong tree format now !
         *  tree [0][0] = source
         *  tree [0][1] = neigbour 1
         *  tree [0][2] = neighbour 2
         *  ...
         * 
         * need to bee
         *  tree [0][0] = source
         *  tree [0][1] = neigbour 1
         * 
         *  tree [1][0] = source
         *  tree [1][1] = neighbour 2
         * 
         *  ...
         * then get neighbour neigbours
         *  tree [0][0] = source
         *  tree [0][1] = neigbour 1
         *  tree [0][2] = neigbour 1, neighbour 1
         * 
         *  tree [1][0] = source
         *  tree [1][1] = neigbour 1
         *  tree [1][2] = neigbour 1, neighbour 2     
         * 
         *  tree [2][0] = source
         *  tree [2][1] = neigbour 2
         *  tree [2][2] = neigbour 2 neighbour 1  
         * 
         *  tree [3][0] = source
         *  tree [3][1] = neigbour 2
         *  tree [3][2] = neigbour 2 neighbour 2 
         * 
         * HINT: use vectors, can use copy / insert
         */
        
    }

    public void paint(Graphics2D g2) {
    }

    private Point2D.Double[] Neighbours(Point2D.Double pt) {
        Point2D.Double[] neighbours = new Point2D.Double[5];
        Point2D.Double Check = pt;
        int NrOfNeibours = 0;

        // check top
        Check = pt;
        Check.x = pt.getY() - 1;
        for (int i = 0; i < 12; i++) {
            if (Pointlist[i] != null) {
                if (Pointlist[i] == Check) {
                    neighbours[NrOfNeibours] = Check;
                    NrOfNeibours++;
                }
            }
        }

        // check front
        Check = pt;
        Check.x = pt.getX() + 1;
        for (int i = 0; i < 12; i++) {
            if (Pointlist[i] != null) {
                if (Pointlist[i] == Check) {
                    neighbours[NrOfNeibours] = Check;
                    NrOfNeibours++;
                }
            }
        }

        // check bottom
        Check = pt;
        Check.x = pt.getY() + 1;
        for (int i = 0; i < 12; i++) {
            if (Pointlist[i] != null) {
                if (Pointlist[i] == Check) {
                    neighbours[NrOfNeibours] = Check;
                    NrOfNeibours++;
                }
            }
        }
        return neighbours;
    }
    private void SetTrees(){
        for (int i = 0; i < 12; i++){
            // Get neighbours of the point
            Cue = Neighbours(Pointlist[i]);
            // set start point (if it is variable, I don't have problems)
            Tree[i][0] = Pointlist[i];
            for (int j = 0; j < 5; j++){
                // make a tree path for every neighbour
                Tree[i][j+1] = Cue[j];
            }
        }
    }
//findShortestPath(source,target):
//  queue<- new queue
//  visited <- {}
//  Map<point,point> parents <- empty map
//  queue.push(source)
//  while (queue.empty() == false): 
//     current <- queue.takeFirst()
//     if (current.equals(source)):
//         extract the path from parents(*)
//     visited.add(current)
//     for each p such that p and current are neighbors: //insert neighbors to queue
//          if p is not in visited: 
//                if (p is not an obstacle):
//                   queue.push(p)
//                   parents.put(p,current) //current is the parent of p
}
