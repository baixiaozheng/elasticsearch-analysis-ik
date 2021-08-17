package org.wltea.analyzer.dic;

import org.apache.logging.log4j.Logger;
import org.wltea.analyzer.help.ESPluginLoggerFactory;

public class HotDictReloadThread {

    private static final Logger LOGGER = ESPluginLoggerFactory.getLogger(HotDictReloadThread.class.getName());

    public void initial() {
        while (true) {
            LOGGER.info("正在调用HotDictReloadThread...");
            Dictionary.getSingleton().reLoadMainDict();
            try {
                Thread.sleep(60_000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
