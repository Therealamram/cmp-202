public class Physics {
    
    float calculateVelocity(float distance, int time){
        return distance/time;
    }
    float calculateVelocity(float initiaVelocity, float acceleration, int time){
        return initiaVelocity + (acceleration * time);
    }
}
