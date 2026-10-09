class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        while (low < high) {
            int speed = low + (high - low) / 2;
            long hoursNeeded = 0;
            for (int pile : piles) {
                hoursNeeded += (pile + speed - 1) / speed;
            }
            if (hoursNeeded <= h) {
                high = speed;      
            } else {
                low = speed + 1;    
            }
        }
        return low;
    }
}