package com.lxj.frameanimation;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class FrameAnimationView extends android.support.v7.widget.AppCompatImageView {
    private int[] frames;
    private int interval = 50; // 每帧的间隔时间
    private boolean isLoop = true; // 是否循环播放
    private int currentFrame = 0; //当前帧
    private boolean isRunnging = false; // 是否正在播放
    public FrameAnimationView(Context context) {
        this(context, null);
    }

    public FrameAnimationView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public FrameAnimationView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackgroundResource(frames[0]);
    }

    public FrameAnimationView setFramesArray(int[] arr){
        this.frames = arr;
        return this;
    }
    public FrameAnimationView setInterval(int interval){
        this.interval = interval;
        return this;
    }
    public FrameAnimationView setIsLoop(boolean isLoop){
        this.isLoop = isLoop;
        return this;
    }

    public void start(){
        if(frames==null || frames.length==0){
            throw new IllegalArgumentException("frames must be set!");
        }
        isRunnging = true;
        play();
    }


    public void stop(){
        isRunnging = false;
        currentFrame = 0;
        removeCallbacks(playTask);
    }

    private void play(){
        if(currentFrame == (frames.length-1)){
            if(isLoop){
                currentFrame = 0;
            }else {
                stop();
                return;
            }
        }else {
            currentFrame++;
        }

        postDelayed(playTask, interval);
    }

    Runnable playTask = new Runnable() {
        @Override
        public void run() {
            if(!isRunnging)return;

            setBackgroundResource(frames[currentFrame]);
            play();
        }
    };
}
