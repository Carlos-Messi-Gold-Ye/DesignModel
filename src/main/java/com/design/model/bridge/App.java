package com.design.model.bridge;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-09-07 14:29:45
 **/
public class App {

    public static void main(String[] args) {
        DirectDept directDept = new DirectDept(new BlocVehicle());
        directDept.rentalPostings();
        DirectDept directDept1 = new DirectDept(new LeagueVehicle());
        directDept1.rentalPostings();

        FranchisedDept franchisedDept = new FranchisedDept(new BlocVehicle());
        franchisedDept.rentalPostings();

        FranchisedDept franchisedDept1 = new FranchisedDept(new LeagueVehicle());
        franchisedDept1.rentalPostings();
    }
}
