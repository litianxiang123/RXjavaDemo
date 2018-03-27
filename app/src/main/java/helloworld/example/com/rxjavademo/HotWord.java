package helloworld.example.com.rxjavademo;

/**
 * Created by 李天祥 on 2018/3/26.
 */

public class HotWord {


        /**
         * createTime : 1521698494000
         * hotId : 1
         * hotStatus : 1
         * hotWord : 运动鞋男
         * platform : ios
         * position : 1
         */

        private long createTime;
        private int hotId;
        private int hotStatus;
        private String hotWord;
        private String platform;
        private int position;

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public int getHotId() {
            return hotId;
        }

        public void setHotId(int hotId) {
            this.hotId = hotId;
        }

        public int getHotStatus() {
            return hotStatus;
        }

        public void setHotStatus(int hotStatus) {
            this.hotStatus = hotStatus;
        }

        public String getHotWord() {
            return hotWord;
        }

        public void setHotWord(String hotWord) {
            this.hotWord = hotWord;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

}
