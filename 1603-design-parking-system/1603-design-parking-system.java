class ParkingSystem {
    int cnt1,cnt2,cnt3;
    
    public ParkingSystem(int big, int medium, int small) {
        cnt1=big;
        cnt2=medium;
        cnt3=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(cnt1>0){
                cnt1--;
                return true;
            }
            else    return false;
        }else if(carType==2){
            if(cnt2>0){
                cnt2--;
                return true;
            }
            else    return false;
        }else{
            if(cnt3>0){
                cnt3--;
                return true;
            }
            else    return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */