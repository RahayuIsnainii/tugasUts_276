/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

public class rakitan {
    public static void main(String[] args) {
        intel intel1 = new intel(2);
        AMD amd1 = new AMD(3);
        komputer komputer1 = new komputer(intel1);
        
        komputer1.cetakinfo();
        komputer1.mencabut(intel1);
        komputer1.memasang(amd1);
        komputer1.cetakinfo();
    }
}
