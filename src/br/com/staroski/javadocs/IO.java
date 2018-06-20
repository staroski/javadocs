package br.com.staroski.javadocs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe utilit&aacute;ria para opera&ccedil;&otilde;es de I/O
 * 
 * @author Ricardo Artur Staroski
 */
final class IO {

    /**
     * Obt&eacute;m todas as linhas do arquivo informado
     * 
     * @param file
     *            O arquivo do qual se deseja ler as linhas
     * @return Uma lista de contendo as linhas do arquivo
     * @throws IOException
     */
    public static List<String> readLines(File file) throws IOException {
        List<String> lines = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = input.readLine()) != null) {
            lines.add(line);
        }
        input.close();
        return lines;
    }

    /**
     * Grava as linhas no arquivo informado
     * 
     * @param lines
     *            As linhas a serem gravadas
     * @param file
     *            O arquivo no qual se deseja gravar as linhas
     * @throws IOException
     */
    public static void writeLines(File file, List<String> lines) throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter(file));
        for (int i = 0, n = lines.size(); i < n; i++) {
            if (i > 0) {
                output.newLine();
            }
            output.write(lines.get(i));
        }
        output.flush();
        output.close();
    }

    private IO() {}
}
