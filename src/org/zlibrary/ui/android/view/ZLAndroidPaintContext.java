package org.zlibrary.ui.android.view;

import android.graphics.Canvas;
import android.graphics.Paint;

import org.zlibrary.options.util.ZLColor;
import org.zlibrary.core.view.ZLPaintContext;

public class ZLAndroidPaintContext extends ZLPaintContext {
	private Canvas myCanvas;
	private final Paint myPaint;

	private int myWidth;
	private int myHeight;

	ZLAndroidPaintContext() {
		myPaint = new Paint();
		myPaint.setAntiAlias(true);
	}

	void setSize(int w, int h) {
		myWidth = w;
		myHeight = h;
	}

	void beginPaint(Canvas canvas) {
		myCanvas = canvas;
	}

	void endPaint() {
		myCanvas = null;
	}

	public void clear(ZLColor color) {
		// TODO: implement
	}

	public void setFont(String family, int size, boolean bold, boolean italic) {
		// TODO: implement
	}

	public void setColor(ZLColor color, LineStyle style) {
		// TODO: implement
	}

	public void setFillColor(ZLColor color, FillStyle style) {
		// TODO: implement
	}

	public int getWidth() {
		return myWidth;
	}
	public int getHeight() {
		return myHeight;
	}
	
	public int getStringWidth(String string/*, int len*/) {
		float[] widths = new float[string.length()];
		myPaint.getTextWidths(string, 0, string.length(), widths);
		float sum = 0;
		for (int i = 0; i < widths.length; ++i) {
			sum += widths[i];
		}
		return (int)sum;
	}
	public int getSpaceWidth() {
		return myPaint.getTextWidths(" ", 0, 1, new float[1]);
	}
	public int getStringHeight() {
		// TODO: implement
		return 20;
	}
	public int getDescent() {
		// TODO: implement
		return 0;
	}
	public void drawString(int x, int y, String string/*, int len*/) {
		myCanvas.drawText(string, 0, string.length(), x, y, myPaint);
	}

	//int imageWidth(ZLImageData &image);
	//int imageHeight(ZLImageData &image);
	//public void drawImage(int x, int y, ZLImageData &image);

	public void drawLine(int x0, int y0, int x1, int y1) {
		myCanvas.drawLine(x0, y0, x1, y1, myPaint);
	}

	public void fillRectangle(int x0, int y0, int x1, int y1) {
		// TODO: implement
	}
	public void drawFilledCircle(int x, int y, int r) {
		// TODO: implement
	}

/*	public List<String> fontFamilies() {
		if (myFamilies.isEmpty()) {
			fillFamiliesList(myFamilies);
		}
		return myFamilies;
	}
	
	public String realFontFamilyName(String fontFamily);
	protected void fillFamiliesList(List<String> families);
*/
}
