public class Lamp {
        private int status;
        public Lamp(){
            status = 0;
        }
        public void turnOn(){
            status = 1;
        }
        public void turnOff(){
            status = 0;
        }
        public int isOn() {
            return status;
        }
}

