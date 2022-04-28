package one.block.eosiojavarpcprovider.error;

import one.block.eosiojava.models.rpcProvider.response.RPCResponseError;

public class BlockchainException extends RuntimeException {
    private final RPCResponseError rpcResponseError;

    public BlockchainException(RPCResponseError rpcResponseError) {
        super(rpcResponseError.getError().getWhat());
        this.rpcResponseError = rpcResponseError;
    }

    public RPCResponseError getRpcResponseError() {
        return rpcResponseError;
    }
}
