package ice.graphic;


import javax.microedition.khronos.opengles.GL11;

/**
 * User: ice
 * Date: 11-11-15
 * Time: 下午3:26
 */
public interface GlRes {

    void onEGLContextLost();

    void prepare(GL11 gl);

    //void recycle(GL11 gl);

    void release(GL11 gl);

}