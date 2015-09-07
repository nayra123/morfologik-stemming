package morfologik.fsa.builders;

/*
 * Do-nothing logger.
 */
final class NullMessageLogger implements IMessageLogger {
  @Override
  public void startPart(String header) {
  }

  @Override
  public void endPart() {
  }

  @Override
  public void log(String header, Object... v) {
  }
}
