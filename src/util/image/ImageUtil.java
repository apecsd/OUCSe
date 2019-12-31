package util.image;



import java.awt.image.BufferedImage;

import java.io.FileInputStream;

import java.io.IOException;



import javax.imageio.ImageIO;

import javax.servlet.ServletOutputStream;

import javax.servlet.http.HttpServletResponse;



public class ImageUtil {

	public static final String JPG = "jpg";

	public static final String PNG = "png";

	public static final String BMP = "bmp";

	public static final String GIF = "gif";




	public static void showImage(HttpServletResponse response, String path, boolean isResponseClose) {

		try {

			ServletOutputStream outStream = response.getOutputStream();// 寰楀埌鍚戝鎴风杈撳嚭浜岃繘鍒舵暟鎹殑瀵硅薄

			FileInputStream fis = new FileInputStream(path); // 浠yte娴佺殑鏂瑰紡鎵撳紑鏂囦欢

			byte data[] = new byte[1000];

			while (fis.read(data) > 0) {

				outStream.write(data);

			}

			fis.close();

			response.setContentType("image/*"); // 璁剧疆杩斿洖鐨勬枃浠剁被鍨�

			outStream.write(data); // 杈撳嚭鏁版嵁

			if (isResponseClose) {

				outStream.close();

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

	}




	public static void showImage(HttpServletResponse response, byte[] data, boolean isResponseClose) {

		try {

			ServletOutputStream outStream = response.getOutputStream();


			outStream.write(data);

			response.setContentType("image/*"); 

			outStream.write(data); 

			if (isResponseClose) {

				outStream.close();

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

	}



	public static void showImage(HttpServletResponse response, BufferedImage image, String imgType,

			boolean isResponseClose) {

		try {

			ImageIO.write(image, imgType, response.getOutputStream());

		} catch (IOException e) {

			e.printStackTrace();

		}

	}



}