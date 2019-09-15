package assignment2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ImageLabelReader {
	private Map<String, Integer> imageIdByImageName;
	private Map<Integer, String> imageLabelByImageId;

	//Assuming file1 and file2 are path of corresponding files
	public ImageLabelReader(String file1, String file2) throws FileNotFoundException {
		convertToImageIdByImageNameMap(file2);
		convertToImageLabelByImageIdMap(file1);
	}

	private void convertToImageIdByImageNameMap(String path) throws FileNotFoundException {
		File file = new File(path);
		Scanner scanner = new Scanner(file);
		this.imageIdByImageName = new HashMap<>();
		while (scanner.hasNextLine()) {
			final String[] split = scanner.nextLine().split(" ");
			imageIdByImageName.put(split[0], Integer.valueOf(split[1]));
		}
	}

	private void convertToImageLabelByImageIdMap(String path) throws FileNotFoundException {
		File file = new File(path);
		Scanner scanner = new Scanner(file);
		this.imageLabelByImageId = new HashMap<>();
		while (scanner.hasNextLine()) {
			final String[] split = scanner.nextLine().split(" ", 2);
			imageLabelByImageId.put(Integer.valueOf(split[0]), split[1]);
		}
	}

	public String getLabel(String imageFileName) {
		final Integer imageId = this.imageIdByImageName.get(imageFileName);
		return this.imageLabelByImageId.get(imageId);
	}

	public String[] getImageFiles(String label) {
		List<String> imageFiles = new ArrayList<>();
		this.getImageLabelByImageId().forEach((imageId, lab) -> {
			if (label.equals(lab)) {
				this.getImageIdByImageName().forEach((name, id) -> {
					if (id.equals(imageId)) {
						imageFiles.add(name);
					}
				});
			}
		});
		return imageFiles.toArray(new String[0]);
	}

	public Map<String, Integer> getImageIdByImageName() {
		return imageIdByImageName;
	}

	public Map<Integer, String> getImageLabelByImageId() {
		return imageLabelByImageId;
	}
}

