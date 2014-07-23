/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coordinaterecorder;

/**
 *
 * @author Administrator
 */
public class Coordinate {
    private double x;
    private double y;
    private double z;
    private long timestamp;
    
    public Coordinate (double _x, double _y, double _z, long _timestamp) {
        x = _x;
        y = _y;
        z = _z;
        timestamp = _timestamp;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double getZ() { 
        return z;
    }
    
    public double getTimestamp() {
        return timestamp;
    }
}