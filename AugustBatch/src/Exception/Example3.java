package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example3 {

	public static void main(String[] args) throws FileNotFoundException {

				try {

					File file = new File("C:\\Users\\prate\\Documents");

					FileInputStream fs = new FileInputStream(file);

					try {

						try {

							try {

							} catch (Exception e) {

							} finally {

							}
						} catch (Exception e) {

						} finally {

						}
					} catch (Exception e) {

					} finally {

					}

				} catch (ArithmeticException ex) {

					try {

					} catch (Exception e) {

					} finally {

					}

					System.out.println(ex.getLocalizedMessage());

				} catch (NullPointerException ex) {

					System.out.println(ex.getLocalizedMessage());

				} catch (FileNotFoundException e) {

					System.out.println(e.getLocalizedMessage());

				} catch (Exception e) {

					System.out.println(e.getLocalizedMessage());

				} finally {

					try {

					} catch (Exception e) {

					} finally {

					}
				}

			}

		}

		
		
		
		

